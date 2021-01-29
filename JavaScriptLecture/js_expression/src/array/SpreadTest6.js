const SpreadTest6 = () => {
    let arr = [10, 20, 70, 50, 60, 90]

    // ... 이 Spread(흩뿌리기)
    console.log("SpreadTest6: " + Math.max(...arr))
    // 얘는 흩뿌리기가 안되므로 NaN(Not a Number)
    console.log("SpreadTest6: " + Math.max(arr))

    return (
        <div className="SpreadTest6">
            <p>
                Spread Test 6
            </p>
        </div>
    )
}

export default SpreadTest6