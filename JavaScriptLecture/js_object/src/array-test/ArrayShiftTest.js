const ArrayShiftTest = () => {
    let arr = ["one", "two", "three"]

    console.log("Before Shift = " + arr)

    // Queue(큐) 형태의 값 빼기 방식이라고 봐도 무방하다.
    // Stack은 후입선출, Queue는 선입선출이다.
    let elem = arr.shift()

    console.log("After Shift = " + arr)
    console.log("Shift Value = " + elem)

    return (
        <div className="ArrayShiftTest">
            <p>
                Array Shift Test
            </p>
        </div>
    )
}

export default ArrayShiftTest