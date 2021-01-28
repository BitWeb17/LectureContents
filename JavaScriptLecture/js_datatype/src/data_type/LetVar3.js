function LetVar3() {
    var varNum = 33

    console.log("var test: " + varNum)

    var varNum = "뭐야 ?"

    console.log("var test: " + varNum)

    return (
        <div className="LetVar3">
            <p>
                var {varNum}<br/>
            </p>
        </div>
    )
}

export default LetVar3