(babashka.pods/load-pod ["./pod-lispyclouds-sqlite.py"])
(require '[pod.lispyclouds.sqlite :as sqlite])
(sqlite/execute! "create table if not exists foo ( int foo )")
(sqlite/execute! "delete from foo")
(sqlite/execute! "insert into foo values (1), (2)")
(sqlite/execute! "select * from foo") ;;=> ([1] [2])
