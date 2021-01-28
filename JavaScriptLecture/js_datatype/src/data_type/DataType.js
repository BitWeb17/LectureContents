function DataType() {
    var test1 = 7 + "Test"
    var test2 = "7" + "test"
    var numTest = 3 + 7 + "Test"

    console.log("DataType: " + test1)
    console.log("DataType: " + test2)
    console.log("DataType: " + numTest)

    return (
        <div className="DataType">
            <p>
                {test1}, {test2}, {numTest}.
            </p>
        </div>
    )
}

export default DataType