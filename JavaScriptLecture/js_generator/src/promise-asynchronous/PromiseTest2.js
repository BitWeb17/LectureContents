const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello ")
            resolve("World!!!");
        }, 2000)
    }
)

promise.then(function (response) {
    console.log(response)
})

const PromiseTest2 = () => {
    console.log("PromiseTest2 Start")

    console.log("PromiseTest2 Fin")

    return (
        <div className="PromiseTest2">
            <p>PromiseTest2</p>
        </div>
    )
}

export default PromiseTest2