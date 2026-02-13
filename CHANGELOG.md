# Changelog

## [1.0.0](https://github.com/shekhar669/maven-common-api/compare/core-v0.3.0...core-v1.0.0) (2026-02-13)


### ⚠ BREAKING CHANGES

* JDK upgrade from 17 to 21
* JDK upgrade from 17 to 21

### Features

* add build workflow on release PR merge and fix SNAPSHOT versions ([d4c8fa9](https://github.com/shekhar669/maven-common-api/commit/d4c8fa909b731bebb0554d003042cd889cbcff60))
* add manual approval for release creation ([702d82a](https://github.com/shekhar669/maven-common-api/commit/702d82a7112fdac47414b6b5de3df659df183c53))
* JDK upgrade from 17 to 21 ([23c3ec7](https://github.com/shekhar669/maven-common-api/commit/23c3ec79611ba06c53139ef4ec30c98294f13a26))
* JDK upgrade from 17 to 21 ([23c3ec7](https://github.com/shekhar669/maven-common-api/commit/23c3ec79611ba06c53139ef4ec30c98294f13a26))
* log message correction ([98a2351](https://github.com/shekhar669/maven-common-api/commit/98a23518a5b16fed0c6ee0d15a976f62d04f4bda))
* **service1:** log message correction ([b7da826](https://github.com/shekhar669/maven-common-api/commit/b7da826ab662b50cbb886d06adc51208d78ff8ad))
* **service1:** log message correction ([b7da826](https://github.com/shekhar669/maven-common-api/commit/b7da826ab662b50cbb886d06adc51208d78ff8ad))
* **service1:** log message correction ([98a2351](https://github.com/shekhar669/maven-common-api/commit/98a23518a5b16fed0c6ee0d15a976f62d04f4bda))
* use GitHub Environments for release approval ([2af818f](https://github.com/shekhar669/maven-common-api/commit/2af818f967683d6cc5dd433f6cb0397fb400abac))


### Bug Fixes

* update approval issue to show all release outputs ([65fc844](https://github.com/shekhar669/maven-common-api/commit/65fc844369f8f78231b7612774b558ee4717b090))
* use simple release-type to avoid SNAPSHOT versions ([4145a81](https://github.com/shekhar669/maven-common-api/commit/4145a818ecdbade99be651abb3ab41d12ba03529))
* use simple string paths for extra-files ([c8d34f9](https://github.com/shekhar669/maven-common-api/commit/c8d34f915c2aab94de425245be743dee64c1c9c8))

## [0.3.0](https://github.com/shekhar669/maven-common-api/compare/core-v0.2.1...core-v0.3.0) (2026-02-09)


### Features

* add release validation workflows and CODEOWNERS ([0d6a50e](https://github.com/shekhar669/maven-common-api/commit/0d6a50ea02c632bd48e8f44f3b787ef3b79157df))
* add workflow to auto-sync pom.xml versions after release ([ff4dc4b](https://github.com/shekhar669/maven-common-api/commit/ff4dc4bff79a946daf7a0ca9b19ed91bcf249702))
* **security:** add token encryption method ([78df2bd](https://github.com/shekhar669/maven-common-api/commit/78df2bd47654695397580f4229d5b60000f86e24))
* **security:** add token expiration check ([8c63b21](https://github.com/shekhar669/maven-common-api/commit/8c63b21c5a3500c77934b09f994906dd96bfe8e6))
* **security:** add token validation method ([b1d6dcb](https://github.com/shekhar669/maven-common-api/commit/b1d6dcbd5d67f3cdfefcdb4dede6b34a1a499a4f))
* **service1:** add getServiceName method ([b3a633a](https://github.com/shekhar669/maven-common-api/commit/b3a633ac2eecd6aa0cbf6ecf4a66b6ed043609a2))
* **service2:** add data processing capability ([956178f](https://github.com/shekhar669/maven-common-api/commit/956178fdcd5f30a5b20c362f5b088057e7b4921e))
* **service2:** add getServiceInfo method ([c401b00](https://github.com/shekhar669/maven-common-api/commit/c401b006ecc755904181d702f33b3f7cb31559a0))
* **service2:** add getServiceInfo method ([7595b39](https://github.com/shekhar669/maven-common-api/commit/7595b39fb0d7feffa2239afa10812c64494da8c8))


### Bug Fixes

* add required permissions for PR comment and label actions ([5e8063a](https://github.com/shekhar669/maven-common-api/commit/5e8063a17f622c0cf10f84315a02459968668920))
* change release-type to maven to properly update pom.xml files ([f061212](https://github.com/shekhar669/maven-common-api/commit/f061212418ace60100aaef1e707a69c6dd43bdab))
* remove path filter to allow workflow to determine validation scope ([ae8355f](https://github.com/shekhar669/maven-common-api/commit/ae8355f4c6f61bb845f4daf4821ec41f5319d824))
* remove root package to prevent service2 commits in core changelog ([c636012](https://github.com/shekhar669/maven-common-api/commit/c6360123899758a66cf046c63e90d65dc2786b55))
* revert to original simple release-type config that was working ([5bab4c3](https://github.com/shekhar669/maven-common-api/commit/5bab4c39919d70b3dd306d96c19d58d668146e5a))
* **service1:** add getServiceName method to return service identifier ([94baf7f](https://github.com/shekhar669/maven-common-api/commit/94baf7fa2b051e72d8e4ab985ec4617e042e7a20))
* skip merge commits and release-please commits in validation ([8edda5e](https://github.com/shekhar669/maven-common-api/commit/8edda5edbf5da094bdff74f6b9851156d878235e))
* update release-please config to properly group core components and separate service2 PRs ([cf93ca2](https://github.com/shekhar669/maven-common-api/commit/cf93ca22755f0f486aa55205490a9ce654511b72))
* use generic updater type for pom.xml files ([43bcd53](https://github.com/shekhar669/maven-common-api/commit/43bcd537844023a92b54dd4f42c1a89f6a8daf43))
* use relative paths for parent pom files in security package ([bf62dd0](https://github.com/shekhar669/maven-common-api/commit/bf62dd00be0ae9b9e15716018770acf53fcca09b))
* use repository root paths and add changelog filtering for core component ([9aebb8c](https://github.com/shekhar669/maven-common-api/commit/9aebb8cad058730c8f3cbd539956a38b783a0ca1))
* use xml updater for pom.xml files with xpath ([3ea2cf2](https://github.com/shekhar669/maven-common-api/commit/3ea2cf2f5a0a149eb0d5a3b56e4ca7052ace2d4b))
* validate only relevant components based on release PR branch ([0e53ced](https://github.com/shekhar669/maven-common-api/commit/0e53cedce8b01f0b2fc596afb849d1732666e14f))

## [0.2.0](https://github.com/shekhar669/maven-common-api/compare/core-v0.1.0...core-v0.2.0) (2026-02-09)


### Features

* add release validation workflows and CODEOWNERS ([0d6a50e](https://github.com/shekhar669/maven-common-api/commit/0d6a50ea02c632bd48e8f44f3b787ef3b79157df))
* **security:** add token encryption method ([78df2bd](https://github.com/shekhar669/maven-common-api/commit/78df2bd47654695397580f4229d5b60000f86e24))
* **security:** add token expiration check ([8c63b21](https://github.com/shekhar669/maven-common-api/commit/8c63b21c5a3500c77934b09f994906dd96bfe8e6))
* **security:** add token validation method ([b1d6dcb](https://github.com/shekhar669/maven-common-api/commit/b1d6dcbd5d67f3cdfefcdb4dede6b34a1a499a4f))
* **service1:** add getServiceName method ([b3a633a](https://github.com/shekhar669/maven-common-api/commit/b3a633ac2eecd6aa0cbf6ecf4a66b6ed043609a2))
* **service2:** add data processing capability ([956178f](https://github.com/shekhar669/maven-common-api/commit/956178fdcd5f30a5b20c362f5b088057e7b4921e))
* **service2:** add getServiceInfo method ([c401b00](https://github.com/shekhar669/maven-common-api/commit/c401b006ecc755904181d702f33b3f7cb31559a0))
* **service2:** add getServiceInfo method ([7595b39](https://github.com/shekhar669/maven-common-api/commit/7595b39fb0d7feffa2239afa10812c64494da8c8))


### Bug Fixes

* add required permissions for PR comment and label actions ([5e8063a](https://github.com/shekhar669/maven-common-api/commit/5e8063a17f622c0cf10f84315a02459968668920))
* change release-type to maven to properly update pom.xml files ([f061212](https://github.com/shekhar669/maven-common-api/commit/f061212418ace60100aaef1e707a69c6dd43bdab))
* remove path filter to allow workflow to determine validation scope ([ae8355f](https://github.com/shekhar669/maven-common-api/commit/ae8355f4c6f61bb845f4daf4821ec41f5319d824))
* remove root package to prevent service2 commits in core changelog ([c636012](https://github.com/shekhar669/maven-common-api/commit/c6360123899758a66cf046c63e90d65dc2786b55))
* revert to original simple release-type config that was working ([5bab4c3](https://github.com/shekhar669/maven-common-api/commit/5bab4c39919d70b3dd306d96c19d58d668146e5a))
* **service1:** add getServiceName method to return service identifier ([94baf7f](https://github.com/shekhar669/maven-common-api/commit/94baf7fa2b051e72d8e4ab985ec4617e042e7a20))
* skip merge commits and release-please commits in validation ([8edda5e](https://github.com/shekhar669/maven-common-api/commit/8edda5edbf5da094bdff74f6b9851156d878235e))
* update release-please config to properly group core components and separate service2 PRs ([cf93ca2](https://github.com/shekhar669/maven-common-api/commit/cf93ca22755f0f486aa55205490a9ce654511b72))
* use generic updater type for pom.xml files ([43bcd53](https://github.com/shekhar669/maven-common-api/commit/43bcd537844023a92b54dd4f42c1a89f6a8daf43))
* use relative paths for parent pom files in security package ([bf62dd0](https://github.com/shekhar669/maven-common-api/commit/bf62dd00be0ae9b9e15716018770acf53fcca09b))
* use repository root paths and add changelog filtering for core component ([9aebb8c](https://github.com/shekhar669/maven-common-api/commit/9aebb8cad058730c8f3cbd539956a38b783a0ca1))
* use xml updater for pom.xml files with xpath ([3ea2cf2](https://github.com/shekhar669/maven-common-api/commit/3ea2cf2f5a0a149eb0d5a3b56e4ca7052ace2d4b))
* validate only relevant components based on release PR branch ([0e53ced](https://github.com/shekhar669/maven-common-api/commit/0e53cedce8b01f0b2fc596afb849d1732666e14f))
