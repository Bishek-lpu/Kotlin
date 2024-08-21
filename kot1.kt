// fun main() {
    
//     var x = 10;
    
//     var type = (x::class.simpleName);
    
//     if (x%2==0){
//         println("The Given Number $x is even Number.")
//     }
//     else{
//         println("The Given Number $x is odd Number.")
//     }
    

// }

// // fun <T> type(x: T): kotlin.String{
// //     return (x::class.simpleName)
// // }


// fun <T : Any> type(value: T): String {
//     val typ = value::class.simpleName;
//     return typ.toString();
// }



// val Book = "Class"




// fun main(Bishek:Array<String>){
//     var x = 45;   // Variables value
//     val y = 100  // Constance value
    
    
// //     val if = 56;  // Syntax error:
    
//     println(x+y);
     
//     val `if` = "hello"
    
//     var `Hello` =  "hello"
    
//     val _hero = "hello"
    
// //     val $go = 100
    
//     val a:Int = 45;
    
//     val b:String = "Hello World";
    
//     println(`if`)
    
//     println(`Hello`)
    
// //     print(Hello Bishek)

// println(Book)
    
    
// }



// Can contain letters, digits, underscores, and dollar signs.

// Should start with a lowercase letter.

// Can also begin with $ and _ (but this is discouraged).

// Are case-sensitive ("myVar" and "myvar" are different variables).

// Should follow camelCase convention (e.g., userName, numberOfItems).

// Should be meaningful and descriptive.


// class Hero{
//     val message: String
    
//     init{
//         message = "hello";
// //         println("Good boy")
//     }    
// }



// fun main(){
//     val c1 = Hero()
//     println(c1.message)
// }






//  ----------------------------------------------------------- 2nd Page ---------------------------------------------------------------


// fun main(){
// // val expression:String = "2,5"
    
//     val a = 5;
//     val b = 10;
//    	val op = "/";
    
    
//     val work = when (op){
//         "+" -> println(a+b);
//         "-" -> println(a-b);
//         "*" -> println(a*b);
//         "/" -> println(a/b);
//         "%" -> println(a%b);
//         else -> println("Unknown")
//     }
// // 	println(expression.split("+"))
// }


// fun main() {
//     val choice = "apple"
//     val result = when (choice) {
//         "apple" -> print("Apple is red")
//         "banana" -> print("Banana is yellow")
//         "grape" -> print("Grape is green")
//         else -> print("Unknown fruit color")
//     }
// }




// // ---------------------------------------------- day 3 20/80/2024 ---------------------------------------------------















// fun main(){
//     var a:Int = 10;
//     var b:Int = 20;
//     var name:String = "John"
// 	val birthyear:Int = 1975 
//     println("Sum of $a and $b is ${a+b}")
// }


// Number -> Int/ Float/ Byte 8bit/Short/ Long/ Float
// String
// Char
// Boolean
// Array



fun main(){
    //     val letter: Char;
    //     letter = 'A';
    //     println("$letter");
        
    //     println('\n');
    //     println('\$');
    //     println('\\');
    //     println("""\ $""");
        
    //     println("Bishek\nBishek\nBishek\nBishek\nBishek")
    //     println("""
    //     Bishek
    //           Bishek
    //     		Bishek
    //     			Bishek
    //     				Bishek
    //     """)
        
    //     println("\tBishek\nBishek\t\tBishek\n\tBishek")
        
    //     println("""
    //     	Bishek
    //  Bishek  	Bishek
    //     	Bishek
    //     """)
        
        
    //     println("Bishek\n")
        
        
        
        
        
        // Array in Kotlin
        val simpleArray = arrayOf(1, 2, 3)
        println(simpleArray.joinToString())
        
        println(simpleArray)
        
        val word: Array<String> = arrayOf("Bishek","helo","Go");
        println(word[2])
        
        var squares = Array(5) {i -> i *i}
        println(squares[2])
        
           
        
    }