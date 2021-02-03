const AllocRandomNumber = (arr) => {
    console.log("AllocRandomNumber Called")

    for(var i = 0; i < arr.length; i++) {
        arr[i] = Math.floor(Math.random() * 10000) + 1
    }
}

const CreateRandomTeam = (arr, num) => {
    console.log("CreateRandomTeam Called")

    const ERROR = -1
}

const CheckWinner = (arr, winArr) => {
    const CRITERIA = 1013
}

Array.prototype.arrDivide = function (num) {
    let arr = this
    let len = arr.length
    let cnt = Math.ceil(len / num)

    let newArr = []

    for(var i = 0; i < cnt; i++) {
        newArr.push(arr.splice(0, num))
    }

    return newArr
}

Array.prototype.printArr = function(num) {
    let arr = this
    let len = arr.length

    for (var i = 0; i < len; i += num) {
        console.log(arr[i], arr[i + 1], arr[i + 2], arr[i + 3])
    }
}

const CalcDividend = (teamArr, winArr, price) => {
    const ALL = 16
    const THREEFOUR = 8
    const TWOFOUR = 4
    const ZERO = 0

    const TEAMMEMNUM = 4
}

const Prob = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const TEAMNUM = NUMOFPERSON / MAXTEAMNUM
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    let teamMap = new Map()
    let teamArr = new Array(TEAMNUM)

    for(var i = 0; i < TEAMNUM; i++) {
        teamArr[i] = new Array(MAXTEAMNUM)
    }

    let winnerArr = new Array(NUMOFPERSON)

    teamMap.set("team", teamArr)
    teamMap.set("winner", winnerArr)

    let totalMap = new Map()

    console.log(teamMap)

    return (
        <div className="Prob">
            <p>Prob</p>
        </div>
    )
}

export default Prob