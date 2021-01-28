function LetVar2() {
    let num = 77

    console.log("let test: " + num)

    num = "뭐야 ?"

    return (
        <div className="LetVar2">
            <p>
                let {num}<br/>
            </p>
        </div>
    )
}

export default LetVar2