const FunctionObjectTest2 = () => {
    function Programming() {
        this.name = "JavaScript"
        this.students = 17
    }

    Programming.prototype.getName = function() {
        return this.name
    }

    let prog = new Programming()

    if(Programming) {
        console.log("FunctionObjectTest2: Programming true")
    } else {
        console.log("FunctionObjectTest2: Programming false")
    }

    console.log("FunctionObjectTest2: " + prog)

    if(prog) {
        console.log("FunctionObjectTest2: prog true")
    } else {
        console.log("FunctionObjectTest2: prog false")
    }

    console.log("FunctionObjectTest2: " + prog.name)

    if(prog.name) {
        console.log("FunctionObjectTest2: prog.name true")
    } else {
        console.log("FunctionObjectTest2: prog.name false")
    }

    console.log("FunctionObjectTest2: " + prog.students)

    if(prog.students) {
        console.log("FunctionObjectTest2: prog.students true")
    } else {
        console.log("FunctionObjectTest2: prog.students false")
    }

    console.log("FunctionObjectTest2: prog.getName - " + prog.getName)
    console.log(prog.getName())

    if(prog.getName) {
        console.log("FunctionObjectTest2: prog.getName true")
    } else {
        console.log("FunctionObjectTest2: prog.getName false")
    }

    console.log("FunctionObjectTest2: prog.toString - " + prog.toString)
    console.log(prog.toString())

    if(prog.toString) {
        console.log("FunctionObjectTest2: prog.toString true")
    } else {
        console.log("FunctionObjectTest2: prog.toString false")
    }

    console.log("FunctionObjectTest2: prog.name2 - " + prog.name2)

    // 자바스크립트에서 없는 것은 결국 undefined로 false 처리됨
    if(prog.name2) {
        console.log("FunctionObjectTest2: prog.name2 true")
    } else {
        console.log("FunctionObjectTest2: prog.name2 false")
    }

    console.log("FunctionObjectTest2: prog.getName2 - " + prog.getName2)

    if(prog.getName2) {
        console.log("FunctionObjectTest2: prog.getName2 true")
    } else {
        console.log("FunctionObjectTest2: prog.getName2 false")
    }

    // ~~ in 객체에서 잡히고
    // hasOwnProperty에서 거짓이 나오면 필요에 의해 새로 추가한 객체
    // 양쪽 모두에서 잡히면 원래부터 가지고 있던 순수한 속성
    console.log("FunctionObjectTest2: " + ("name" in prog))
    console.log("FunctionObjectTest2: " + ("students" in prog))
    console.log("FunctionObjectTest2: " + ("getName" in prog))
    console.log("FunctionObjectTest2: " + ("name2" in prog))

    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("students")))
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("getName")))
    console.log("FunctionObjectTest2: " +
        ("toString" in prog))
    console.log("FunctionObjectTest2: " +
        (prog.hasOwnProperty("toString")))

    console.log("FunctionObjectTest2: " + JSON.stringify(prog))

    return (
        <div className="FunctionObjectTest2">
            <p>
                Function Object Test 2
            </p>
        </div>
    )
}

export default FunctionObjectTest2