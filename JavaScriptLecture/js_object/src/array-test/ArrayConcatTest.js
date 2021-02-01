const ArrayConcatTest = () => {
    let test = ["four", "six", "ten"]

    console.log("Before Concat = " + test)

    test = test.concat(test)

    console.log("After Concat = " + test)

    test = test.concat("I can add String!!!")

    console.log("After Concat = " + test)

    let arr1 = [1, 3]
    let arr2 = [3, 7]

    test = test.concat(arr1, arr2)

    console.log("After Concat = " + test)

    return (
        <div className="ArrayConcatTest">
            <p>
                Array Concat Test
            </p>
        </div>
    )
}

export default ArrayConcatTest