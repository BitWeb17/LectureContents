const ForWithSetMap = () => {
    let mapData = new Map(
        [
            ["David", "Physics"],
            ["Kevin", "Society"]
        ]
    )

    console.log(mapData)

    for (let data of mapData) {
        console.log(data)
    }

    let setData = new Set(
        ["David", "Kevin"]
    )

    console.log(setData)

    for (let data of setData) {
        console.log(data)
    }

    return (
        <div className="ForWithSetMap">
            <p>ForWithSetMap</p>
        </div>
    )
}

export default ForWithSetMap