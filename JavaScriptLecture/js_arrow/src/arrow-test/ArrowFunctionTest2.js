const ArrowFunctionTest2 = () => {
    let add333 = function(val) { return 333 + val }
    console.log("ArrowFunctionTest: " + add333(77))

    let add333Arrow = (val) => { return 333 + val }
    console.log("ArrowFunctionTest: " + add333Arrow(77))

    return (
        <div className="ArrowFunctionTest2">
            <p>
                ArrowFunctionTest2
            </p>
        </div>
    )
}

export default ArrowFunctionTest2