const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello ")
            resolve("World!")
        }, 2000)
    }
)

promise.then(function (response) {
    console.log(response)

    throw new Error("Error!!!")
}).then(response =>
    console.log("Success")
).catch(function (error) {
    console.log(error)
}).finally(() => {
    console.log("PromiseTest8: 나는 무조건 실행된다!!!")
})

const PromiseTest8 = () => {
    console.log("PromiseTest8 Start")

    console.log("PromiseTest8 Fin")

    return (
        <div className="PromiseTest8">
            <p>PromiseTest8</p>
        </div>
    )
}

export default PromiseTest8