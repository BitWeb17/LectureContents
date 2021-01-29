const FunctionObjectTest = () => {
    let add = function (a, b) {
        return a + b
    }

    console.log("FunctionObjectTest: " + add)

    if(add) {
        console.log("FunctionObjectTest: true")
    } else {
        console.log("FunctionObjectTest: false")
    }

    return (
        <div className="FunctionObjectTest">
            <p>
                Function Object Test
            </p>
        </div>
    )
}

export default FunctionObjectTest