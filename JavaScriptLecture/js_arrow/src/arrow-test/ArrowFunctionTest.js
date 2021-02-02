const ArrowFunctionTest = () => {
    let f = function() { return "33" }
    console.log("ArrowFunctionTest: " + f())

    let fArrow = () => { return "33" }
    console.log("ArrowFunctionTest: " + fArrow())

    return (
        <div className="ArrowFunctionTest">
            <p>
                ArrowFunctionTest
            </p>
        </div>
    )
}

export default ArrowFunctionTest