export default {
    countSquare (state) {
        return Math.pow(state.count, 2)
    },
    countWeightSquare (state, getters) {
        return Math.pow(state.count, getters.getWeight)
    },
    getWeight (state) {
        return state.weight;
    },
    getRandom (state) {
        return state.random;
    }
}
