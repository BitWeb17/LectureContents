const SpreadTest = () => {
    let arrColor = ["red", "green", "blue"]
    // ...arrColor는 뭐다 ?
    // 현재 위치에 arrColor를 배치하고 뒤쪽에 purple을 배치한다.
    let newArrColor = [...arrColor, "purple"]

    console.log("SpreadTest: " + arrColor)
    console.log("SpreadTest: " + newArrColor)

    return (
        <div className="SpreadTest">
            <p>
                Spread Test
            </p>
        </div>
    )
}

export default SpreadTest