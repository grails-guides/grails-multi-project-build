# grails-multi-module

Sample app for the apache/grails-static-website guide [grails-multi-module/v8](https://grails.apache.org/guides/grails-multi-module/8/guide/index.html).

A Grails 8 multi-project layout: one shared-core plugin (Book domain + BookService), two web apps (customer + admin) that depend on it.

`initial/` is intentionally empty and points readers at the forge URLs that produce each module. `complete/` is the assembled three-module workspace described by the guide.

```bash
git clone -b grails8 https://github.com/grails-guides/grails-multi-module.git
cd grails-multi-module/complete
./gradlew :webapp-customer:bootRun  # http://localhost:8080
./gradlew :webapp-admin:bootRun     # http://localhost:8080 (run separately)
```
