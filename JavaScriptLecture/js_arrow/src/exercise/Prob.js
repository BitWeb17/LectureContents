const AllocRandomNumber = (arr) => {
    console.log("AllocRandomNumber Called")
    for(var i = 0; i < arr.length; i++) {
        arr[i] = Math.floor(Math.random() * 10000) + 1
    }
}

const CreateRandomTeam = () => {

}

const CheckWinner = () => {

}

const CalcDividend = () => {

}

const Prob = () => {
    const NUMOFPERSON = 1000
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    let arr = new Array(NUMOFPERSON)

    AllocRandomNumber(arr)
    console.log("res = " + arr)

    return (
        <div className="Prob">
            <p>Prob</p>
        </div>
    )
}

export default Prob