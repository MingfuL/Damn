import com.sun.corba.se.spi.orbutil.closure.Closure

//println "Hello Mingfu"
//
//def yoyoyo = "heiheihei";
//def mingfu01 = 'fuck $yoyoyo'
//def mingfu02 = "fuck ${yoyoyo}"
//
//println mingfu01
//println mingfu02
//
//int testInt = 101
//println testInt.getClass().getCanonicalName()

//def closer1 = {
//    println 'closer-->01'
//}
//
//def closer2 = {
//    arg -> println "item is：${arg}"
//}

def fuckU(def p, def closure) {
    closure.call(p)
}

fuckU(1){
    arg ->
        def result = arg + 1
        println "num is "+result
}
