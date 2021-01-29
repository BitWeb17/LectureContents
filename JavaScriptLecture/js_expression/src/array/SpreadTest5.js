const SpreadTest5 = () => {
    let arr = ["a", "b", "c"]

    // 현재 arr가 있고 그 뒤로 아래 보이는 배열을 붙여주세요 ~
    arr.push(...["d", "e", "ff"])
    arr.push(...arr)

    console.log("SpreadTest5: " + arr)

    return (
        <div className="SpreadTest5">
            <p>
                Spread Test 5
            </p>
        </div>
    )
}

export default SpreadTest5