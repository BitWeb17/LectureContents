function ExpDataType() {
    // 123 x 10^5
    var expNum1 = 123e5
    // 123 x 10^-5
    var expNum2 = 123e-5

    console.log("ExpDataType: " + expNum1)
    console.log("ExpDataType: " + expNum2)

    return (
        <div className="ExpDataType">
            <p>
                {expNum1}, {expNum2}
            </p>
        </div>
    )
}

export default ExpDataType