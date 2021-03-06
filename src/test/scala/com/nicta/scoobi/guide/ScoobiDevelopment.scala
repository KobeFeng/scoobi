/**
 * Copyright 2011,2012 National ICT Australia Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nicta.scoobi
package guide

class ScoobiDevelopment extends ScoobiPage { def is = "Scoobi Development".title^
                                                                                                                        """
### Building
  
Building scoobi should be as easy as `sbt publish-local` to build and install scoobi locally. An easy way to insure your applications are picking up your local version of scoobi, is by deleting the version that was downloaded from sonatype. It is stored at ~/.ivy2/cache/com.nicta.scoobi*:
  
### Run the tests
  
`sbt test` will run the unit tests, as well as the tests in local mode. It's also possible to run the tests on a cluster too, with some fancy options (See testing guide)

### User Guide / Docs
  
Are located at `src/test/scala/com/nicta/scoobi/guide`. They can be built with the command:
  
```
$ sbt
> test-only *UserGuide* -- html
```
and are built into `target/spec2-reports/guide-SNAPSHOT/guide`

### Contributions
  
We welcome pull-requests on github. We rebase commits aggressively (up until the point they land on master) to have a clean and linear history. So don't be suprised if the sha1 changes when it lands. As such, it makes our lives a lot easier if your commit is already based on master and all squashed down into nice logical commits.
  
Once landing on master, our build server will then run the full tests on our internal cluster -- and if everything looks good, a new snapshot will be published.

"""
}
