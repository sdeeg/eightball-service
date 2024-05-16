tanzu apps workload create eightball \
      --local-path /Users/sdeeg/Customers/SOI/eightball-kotlin/ \
      --build-env "BP_JVM_VERSION=21" \
      --type server
#      --label "networking.knative.dev/disable-external-domain-tls=true"
#      --label "networking.knative.dev/visibility=cluster-local"

#networking.knative.dev/disable-external-domain-tls: true