const MapDeleteTest = () => {
    let mapData = new Map(
        [
            ["apple", "red"], ["grape", "purple"]
        ]
    )

    console.log(mapData)

    mapData.delete("apple")

    console.log(mapData)

    mapData.clear()

    console.log(mapData)

    return (
        <div className="MapDeleteTest">
            <p>MapDeleteTest</p>
        </div>
    )
}

export default MapDeleteTest