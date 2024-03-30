fun main() {
    /**
     * 코틀린에서의 변수 선언법
     *
     * var : 일반적인 변수 선언
     * val : 한번 선언하면 변경할 수 없는 변수 선언
     *
     * 변수 선언 시 자료형을 명시하지 않아도 자동으로 추론하여 자료형을 지정해준다.
     */
    var a = 10
    val b = 20

    println(a)
    println(b)

    /**
     * 코틀린에서의 자료형
     *
     * 코틀린에서는 자료형을 명시하지 않아도 자동으로 추론하여 자료형을 지정해준다.
     * 하지만 명시적으로 자료형을 지정할 수도 있다.
     *
     * 자료형을 명시하는 방법은 변수명 뒤에 콜론(:)을 붙이고 자료형을 적어주면 된다.
     */
    var c: Int = 30
    val d: Double = 3.14

    println(c)
    println(d)

    /**
     * 코틀린에서 클래스 선언
     *
     * 코틀린에서 클래스를 선언할 때는 class 키워드를 사용한다.
     * 클래스 선언 시 생성자를 사용할 수 있으며 생성자는 클래스명 뒤에 괄호를 열고 닫아서 선언한다.
     * 생성자를 사용하지 않을 경우 괄호를 생략할 수 있다.
     *
     * 클래스 내부에 변수를 선언할 때는 var 또는 val 키워드를 사용하여 선언한다.
     * 클래스 내부에 함수를 선언할 때는 fun 키워드를 사용하여 선언한다.
     *
     */
    class Person {
        var name: String = ""
        var age: Int = 0

        fun printInfo() {
            println("이름: $name, 나이: $age")
        }

        fun printHello() {
            println("Hello")
        }
    }

    val person = Person()
    person.name = "홍길동"
    person.age = 20

    person.printInfo()
    person.printHel
}