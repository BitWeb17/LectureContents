function LetVar() {
    let num = 77

    console.log("num = " + num)
    console.log("let은 Hoisting 되지 않으며 let 위에서 해당 변수를 사용할 수 없다.")
    console.log("var는 되나요 ? " + varTest + " 는 되네 ?!")

    var varTest = "이거 되는거 맞냐 ?"

    const conNum = 33

    varTest = "정말 되는거야 ?"

    console.log("conNum = " + conNum)
    console.log("const는 반드시 선언과 함께 값의 초기화가 이루어져야 한다.")

    return (
        <div className="LetVar">
            <p>
                let {num}<br/>
                const {conNum}<br/>
                var {varTest}<br/>
            </p>
        </div>
    )
}

export default LetVar