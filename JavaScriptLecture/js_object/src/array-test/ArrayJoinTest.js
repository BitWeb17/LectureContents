const ArrayJoinTest = () => {
    var arr = ["one", "two", "three"]

    console.log(arr.toString())
    console.log(arr.join("*"))

    console.log(arr.join("+"))

    return (
        <div className="ArrayJoinTest">
            <p>
                Array Join Test
            </p>
        </div>
    )
}

export default ArrayJoinTest