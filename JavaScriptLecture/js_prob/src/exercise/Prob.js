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
// 연습 문제: 팀 로또 ?!
// 참가자는 총 1000명이다.
// 참가자들은 이 로또 배틀에 참여하기 위해 각자 1000만원을 지불한다.
// 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다.
// 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀)
// 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주한다.

// 배당금은 아래 원칙에 따라 지급한다.
// 모든 팀원이 로또에 당첨된 경우: 승리 수당 배수가 2^4으로 16배 뛴다.
// 팀원중 3명이 당첨된 경우: 승리 수당 배수가 2^3으로 8배 뛴다.
// 팀원중 2명이 당첨된 경우: 승리 수당 배수가 2^2으로 4배 뛴다.
// 팀원중 1명이 당첨된 경우: 원래 수당 그대로 받는다.

// 1) 16: 16: 8: 8: 4: 1: 1: 1: 1: 1: 1: 1: 1: 1
// 2) 16
// 3) 8
// 4) 4
// 5) 1

// 주최측은 무조건적으로 전체 비용의 33%를 가져간다.
// 승리팀의 상태를 출력하고 승리 수당을 분배하여 표시하도록 한다.

// 1) 요구사항 분석
//    ex: 고객사와 미팅(B2B)
//        고객사: 이런거 만들어주세요(계약금 선금 20억 개발후 40억)
//        이런거 ??? 밑도 끝도 없이 ???
//        이런걸 만들려면 어떤 기술들이 필요하고
//        어떤 기능들을 구현해야 가능한지
//        개발 인력 인력은 충분한지
//        현재 상태에서 일정을 맞출 수 있는지
//        알고 있는 내용으로만 개발이 가능한지
//        추가적으로 공부를 해야하는지
//        공부할 내용들이 많은지

//    ex: 회사에서의 업무
//        팀장: 아키텍처 설계하고 적절하게 업무를 분배했음
//        부하직원 <<<--- A 모듈 개발하세요.
//        A 모듈 개발을 위해 어떤 기술들이 필요한가
//        A 모듈을 만들려면 어떤 기능들을 구현해야 하는가
//        현재 내가 알고 있는 지식들로 구현이 가능한가
//        추가적인 공부가 필요한가
//        일정 관리를 어떻게 할 것인가
//        보고서는 어떻게 작성할 것인가
//        유지보수를 편하게 하려면 어떤식으로 코드를 관리해야할까
//        향후 응용을 위해 추상화는 어느 수준까지 할까

// 위의 문제 케이스에 대한 요구사항을 파악해보면 어떻게 적을 수 있을까 ?
// 1) 참가자는 총 1000명이다 ---> 배열 1000개 필요
// 2) 참가자들은 1 ~ 10000 사이의 숫자를 할당 받는다 ---> 랜덤 사용해야함
// 3) 팀원은 랜덤하게 4명씩 짝을 짓는다(총 250개의 팀) ---> 추가 배열 250개 필요
//    ---> 배열 250개를 만들고나니 팀원을 어떻게 구별하지 ?
//         ---> 팀원에게 같은 숫자를 줄까 ?
// 4) 로또 당첨은 1013의 배수를 뽑은 사람이 이긴것으로 간주한다
//    ---> 2번에서 사용한 랜덤이 1013의 배수인지 판정이 필요함
//         ---> 추가적인 배열을 할당했음(1000개)
//              ---> 그래서 누가 이겼는지 어떻게 표시할까 ?
//                   ---> 1이나 true 등을 배치한다.
// 5) 배당금 원칙 ---> 팀의 4명이 모두 1013의 배수라면 16배
//              ---> 팀원중 3명이 1013의 배수면 8배
//              ---> 팀원중 2명이 1013의 배수면 4배
//              ---> 팀원중 1명만 1013의 배수면 1배
//                   ---> filter, reduce 등을 통해 전체 분할 비율을 계산

// 관리의 용이성을 위해 map을 도입했음
// 1), 3), 4)에 배열들을 map에 넣고 나머지는 동일함

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