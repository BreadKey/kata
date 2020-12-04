import 'dart:math';

extension Sort on List<int> {
  List<int> quickSort() {
    if (length < 2) return this;

    final x = _pickPivot(this);

    final listSmallerThanX = where((y) => y < x).toList().quickSort();

    var isSameElementExist = false;
    final listGreaterThanX = where((y) {
      if (x == y) {
        if (isSameElementExist) {
          return true;
        } else {
          isSameElementExist = true;
          return false;
        }
      }

      return y > x;
    }).toList().quickSort();

    return listSmallerThanX + [x] + listGreaterThanX;
  }

  int _pickPivot(List<int> list) => list[Random().nextInt(list.length)];

  bool get isSorted {
    if (length < 2) return true;

    final half = length ~/ 2;

    final left = sublist(0, half);
    final right = sublist(half, length);

    if (left.median > median || right.median < median) return false;

    return left.isSorted && right.isSorted;
  }

  int get median => this[length ~/ 2];

  bool isSubsetOf(List<int> other) {
    if (other.length < length) return false;

    final sortedOther = other.quickSort();
    final sortedList = quickSort();

    var currentIndex = 0;

    for (var value in sortedOther) {
      if (value == sortedList[currentIndex]) {
        currentIndex++;
        if (currentIndex == length) return true;
      } else if (value > sortedList[currentIndex]) {
        return false;
      }
    }

    return false;
  }
}
