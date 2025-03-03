fun main() {
    for(i in 1 .. 7){
        for(j in 1 .. 7){
            if(j == 1 || j == 7 || i == j)
                print("$i$j ")
            print("\t")
        }
        println()
    }
}
