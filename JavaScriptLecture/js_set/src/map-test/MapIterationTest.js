const MapIterationTest = () => {
    let mapData = new Map(
        [
            ["apple", "red"], ["grape", "purple"]
        ]
    )

    console.log(mapData)

    var keyIter = mapData.keys()

    for (var key of keyIter) {
        console.log(key)
    }

    var valueIter = mapData.values()

    for (var value of valueIter) {
        console.log(value)
    }

    var entryIter = mapData.entries()

    for (var entry of entryIter) {
        console.log(entry)
    }

    mapData.forEach(
        (value, key) =>
            console.log(key + " : " + value)
    )

    return (
        <div className="MapIterationTest">
            <p>MapIterationTest</p>
        </div>
    )
}

export default MapIterationTest