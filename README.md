# Actual output:

```
...
[INFO] --- maven-surefire-plugin:3.0.0-M7:test (default-test) @ tree-reporter ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ io.github.rkraneis.treereporter.OuterTest - 0.036s
[INFO] │  └─ ✔ test - 0.011s
[INFO] ├─ ── InnerSub2 - 0.001s
[INFO] │     ├─ ✔ testFromBase - 0s
[INFO] │     └─ ✔ testInnerSub2 - 0.001s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ tree-reporter ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.270 s
[INFO] Finished at: 2022-10-26T11:04:09+02:00
[INFO] ------------------------------------------------------------------------
```
# Expected output:

```
...
[INFO] --- maven-surefire-plugin:3.0.0-M7:test (default-test) @ tree-reporter ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ io.github.rkraneis.treereporter.OuterTest - 0.036s
[INFO] │  └─ ✔ test - 0.011s
[INFO] ├─ ── Inner1 - 0.001s
[INFO] │     └─ ✔ testInner1 - 0.001s
[INFO] ├─ ── Inner2 - 0.001s
[INFO] │     └─ ✔ testInner2 - 0.001s
[INFO] ├─ ── InnerSub1 - 0.001s
[INFO] │     ├─ ✔ testFromBase - 0s
[INFO] │     └─ ✔ testInnerSub1 - 0.001s
[INFO] ├─ ── InnerSub2 - 0.001s
[INFO] │     ├─ ✔ testFromBase - 0s
[INFO] │     └─ ✔ testInnerSub2 - 0.001s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ tree-reporter ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.270 s
[INFO] Finished at: 2022-10-26T11:04:09+02:00
[INFO] ------------------------------------------------------------------------
```