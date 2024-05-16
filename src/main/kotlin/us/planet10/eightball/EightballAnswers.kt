package us.planet10.eightball

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "eightball-answers")
//@JvmRecord
data class EightballAnswers(var defaultSet: String = "foo", val answerSets: Map<String, List<String>>)
