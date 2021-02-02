const SubOrderTest2 = () => {
    let arr = [1, 3, 8, 10, 5, 7, 11, 19, 77, 33]

    var person1 = [
        {name: "Julian", age: 23},
        {name: "Allen", age: 25},
        {name: "Tomas", age: 23},
        {name: "Monica", age: 21}
    ]

    console.log("Before Custom Sort: " + JSON.stringify(person1))

    person1.sort(
        function (a, b) {
            let x = a.name.toLowerCase()
            let y = b.name.toLowerCase()

            if(x < y) {
                return -1
            }
            if(x > y) {
                return 1
            }

            return 0
        }
    )

    console.log("After Custom Sort: " + JSON.stringify(person1))

    return (
        <div className="SubOrderTest2">
            <p>
                custom-lib: SubOrderTest2
            </p>
        </div>
    )
}

export default SubOrderTest2