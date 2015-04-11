1. `git clone https://github.com/pathikrit/ScalaJam.git; cd ScalaJam`
2. IntelliJ -> Open -> Select directory
3. "Save console output to file: " -> output.txt
4. Running from command line: `sbt 'run-main $X'`
5. Before each contest: `git checkout -b $year/$round`
6. During contest: Commit on above branch
7. After contest: `git publish $year/$round; git checkout master; git branch | grep -v "master" | xargs git branch -D`
