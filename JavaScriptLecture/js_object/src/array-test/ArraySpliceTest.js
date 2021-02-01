const ArraySpliceTest = () => {
    let arr = ["one", "two", "three"]

    console.log("Before Splice = " + arr)

    let what = arr.splice(2, 0, "elem1", "elem2")

    console.log("After Splice = " + arr)
    console.log("what = " + what)

    what = arr.splice(2, 2, "elem3", "elem4")
    console.log("what = " + what)

    console.log("After Splice = " + arr)

    arr.splice(1, 2)

    console.log("After Splice = " + arr)

    return (
        <div className="ArraySpliceTest">
            <p>
                Array Splice Test
            </p>
        </div>
    )
}

export default ArraySpliceTest