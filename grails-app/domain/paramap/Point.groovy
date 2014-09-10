package paramap

import paramap.utils.PointType

class Point {

    def String name
    def String codePrefix
    def String codePostfix
    def PointType pointType
    def List<Fraction> fractionList
    def int profitOwner
    def int profitFraction
    def int upgradeCost

    static constraints = {
    }
}
