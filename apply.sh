tanzu apps workload apply eightball \
      --local-path /Users/sdeeg/Customers/SOI/eightball-kotlin/ \
      --build-env "BP_JVM_VERSION=21" \
      --type web \
      --label "networking.knative.dev/disable-external-domain-tls=true"
