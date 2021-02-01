const ArrayPopTest = () => {
    var arr = ["one", "two", "three"]

    console.log("Before Pop = " + arr)

    let elem = arr.pop();

    console.log("After Pop = " + arr)
    console.log("Pop Element = " + elem)

    return (
        <div className="ArrayPopTest">
            <p>
                Array Pop Test
            </p>
        </div>
    )
}

export default ArrayPopTest