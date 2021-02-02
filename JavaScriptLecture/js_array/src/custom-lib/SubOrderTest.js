const SubOrderTest = () => {
    let arr = [1, 3, 8, 10, 5, 7, 11, 19, 77, 33]

    var person1 = [
        {name: "Julian", age: 23},
        {name: "Allen", age: 25},
        {name: "Tomas", age: 23},
        {name: "Monica", age: 21}
    ]

    console.log("Before Custom Sort: " + JSON.stringify(person1))

    person1.sort(
        (a, b) =>
            (a.age - b.age)
    )

    console.log("After Custom Sort: " + JSON.stringify(person1))

    return (
        <div className="SubOrderTest">
            <p>
                custom-lib: SubOrderTest
            </p>
        </div>
    )
}

export default SubOrderTest