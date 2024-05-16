package us.planet10.eightball

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random


@RestController
class EightballAPI(val eightballAnswers: EightballAnswers) {

    private val random: Random = Random(System.currentTimeMillis())

    @GetMapping("/")
    fun info() = "Simple magic EightBall application"

    @GetMapping("/answer-sets")
    fun getAnswerSets() = eightballAnswers.answerSets.keys

    @GetMapping("/answer")
    fun answer(@RequestParam(value = "answer-set", defaultValue = "default") answerSetName: String): String {
        var answerList: List<String>? = null
        if (answerSetName == "default") {
            answerList = eightballAnswers.answerSets.get(eightballAnswers.defaultSet)
        } else {
            answerList = eightballAnswers.answerSets.get(answerSetName)
        }

        var retVal = "empty list"
        if (null != answerList && answerList.size > 0) {
            retVal = answerList[random.nextInt(answerList.size)]
        }

        return retVal
    }

    @GetMapping("/answers")
    fun getAllAnswers(@RequestParam(value = "answer-set", defaultValue = "default") answerSetName: String): List<String>? {
        var answerList: List<String>? = null
        if (answerSetName == "default") {
            answerList = eightballAnswers.answerSets.get(eightballAnswers.defaultSet)
        } else {
            answerList = eightballAnswers.answerSets.get(answerSetName)
        }

        return answerList
    }

}