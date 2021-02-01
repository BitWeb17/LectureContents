const SortTest = () => {
    let arr = ["one", "two", "three"]

    console.log("arr: " + arr)

    let one = arr[0]
    let two = arr[1]
    let three = arr[2]

    console.log("one = " + one + ", two = " + two + ", three = " + three)

    arr = new Array("test1", "test2", "test3")

    console.log(arr)

    let len = arr.length

    console.log("Array Length = " + len)
    console.log("Last Arr = " + arr[len - 1])

    arr = [1, 9, 3, 12, 5, 8, 7]
    let arr2 = [1, 9, 3, 2, 5, 8, 7]

    console.log("Before Sort = " + arr)
    let sortedArr = arr.sort()
    console.log("After Sort = " + sortedArr)

    console.log("Before Sort = " + arr2)
    let sortedArr2 = arr2.sort()
    console.log("After Sort = " + sortedArr2)

    // 배열에서 값을 끄집어내서 비교해보는 것
    // 값을 빼보면 그 차이가 가장 큰넘이 마지막이란 것을 알 수 있음
    console.log("(Solved)Before Sort = " + arr)
    sortedArr = arr.sort((a, b) => a - b)
    console.log("(Solved)After Sort = " + sortedArr)

    len = sortedArr.length

    var text = "<ul>"
    for (var i = 0; i < len; i++) {
        text += "<li>" + sortedArr[i] + "</li>"
    }
    text += "</ul>"

    console.log(text)

    return (
        <div className="SortTest">
            <p>
                Sort Test
            </p>
        </div>
    )
}

export default SortTest