fun main(args: Array<String>) {
    var count = if (args.size > 0) 1 else 0
    for(i in 1..<args.size) {
        if (args[i - 1] != args[i]) {
            count += 1
        }
    }
    println(count)
}
