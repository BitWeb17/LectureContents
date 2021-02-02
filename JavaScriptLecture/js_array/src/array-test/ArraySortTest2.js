const ArraySortTest2 = () => {
    let arr = [1, 3, 8, 10, 5, 7, 11, 19, 77, 33]

    console.log("Before Sort: " + arr)
    arr.sort(function (a, b) {
        return a - b
    })
    console.log("After Sort: " + arr)
    console.log("Find Max = " + arr[arr.length - 1])
    console.log("Find Min = " + arr[0])

    return (
        <div className="ArraySortTest2">
            <p>
                array-test: ArraySortTest2
            </p>
        </div>
    )
}

export default ArraySortTest2