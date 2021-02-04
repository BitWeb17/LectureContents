const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello ")
            reject("Error!")
        }, 2000)
    }
)

promise.then(function (response) {
    console.log("Success")
}).catch(function (error) {
    console.log(error)
})

const PromiseTest3 = () => {
    console.log("PromiseTest3 Start")

    console.log("PromiseTest3 Fin")

    return (
        <div className="PromiseTest3">
            <p>PromiseTest3</p>
        </div>
    )
}

export default PromiseTest3