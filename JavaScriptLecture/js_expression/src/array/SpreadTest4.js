const SpreadTest4 = () => {
    let arrStr = [..."xyz"]

    console.log("SpreadTest4: " + arrStr)

    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    spreadArrPrint(...arrStr)

    return (
        <div className="SpreadTest4">
            <p>
                Spread Test 4
            </p>
        </div>
    )
}

export default SpreadTest4