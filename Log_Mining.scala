// Load error messages from a log into memory 
// Then interactively search for various patterns

//Base RDD

val lines = sc.textFile("hdfs://...")

// transformed RDDs

val erros = lines.filter(_.startWith("ERROR"))
val messages = errors.map(_.split("\t")).map(r => r(1))
messages.cache()

// action 1 
messages.filter(_.conatins("sql")).count()

// Action 2
messages.filter(_.contains("php")).count()

