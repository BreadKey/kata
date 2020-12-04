import 'dart:math';

class QuickSort {
  List<int> sort(List<int> list) {
    if (list.length < 2) return list;

    final x = _pickPivot(list);

    final listSmallerThanX = sort(list.where((y) => y < x).toList());
    final listGreaterThanX = sort(list.where((y) => y > x).toList());

    return listSmallerThanX + [x] + listGreaterThanX;
  }

  int _pickPivot(List<int> list) => list[Random().nextInt(list.length)];
}
