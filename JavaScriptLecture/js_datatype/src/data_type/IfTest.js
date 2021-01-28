function IfTest() {
    var num1 = 3, num2 = 10

    if (num1 !== 10) {
        console.log("IfTest: num1 !== 10")
    } else if(num2 !== 10) {
        console.log("IfTest: num2 !== 10")
    } else {
        console.log("IfTest: works fine!")
    }

    return (
        <div className="IfTest">
            <p>
                IfTest Works Fine!
            </p>
        </div>
    )
}

export default IfTest