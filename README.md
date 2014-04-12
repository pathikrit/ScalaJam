1. `git clone https://github.com/pathikrit/ScalaJam.git`
2. `cd ScalaJam`
3. `sbt gen-idea`
4. IntelliJ -> Open Project -> Select directory
5. "Save console output to file: " -> Output.txt
6. Running from command line: `sbt 'run-main $X'`
7. After each contest:
    1. `git commit -am "GCJ $YEAR $ROUND"`
    2. `git revert HEAD`
    3. `git push`
