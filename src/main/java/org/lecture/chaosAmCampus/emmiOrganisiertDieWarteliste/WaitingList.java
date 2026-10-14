package org.lecture.chaosAmCampus.emmiOrganisiertDieWarteliste;

class WaitingList {
    public boolean isValidId(long id) {
        if (id >= 1000000000L && id <= 9999999999L) {
            return true;
        }
        return false;
    }

    public boolean isValidWaitingList(long[] ids) {
        if (ids == null) {
            return false;
        }
        for (int i = 0; i < ids.length; i++) {
            for (int j = i + 1; j < ids.length; j++) {
                if (ids[i] == ids[j]) {
                    return false;
                }
            }
        }

        for (long id : ids) {
            if (!isValidId(id)) {
                return false;
            }
        }
        return true;
    }

    public long[] organizeWaitingList(long[] ids) {
        if (!isValidWaitingList(ids)) {
            throw new IllegalArgumentException("Warteliste nicht gültig"); //IllegalArgumentationException
        }
        long[] sortedIds = ids.clone();
        mergeSort(sortedIds);
        return sortedIds;


    }


    private void mergeSort(long[] ids) {
        if (ids.length <= 1) {
            return;
        }

        int middle = ids.length / 2;

        long[] leftIds = new long[middle];
        long[] rightIds = new long[ids.length - middle];

        for (int i = 0; i < middle; i++) {
            leftIds[i] = ids[i];
        }
        for (int i = middle; i < ids.length; i++) {// 0 1 2   3 4 5
            rightIds[i - middle] = ids[i];
        }
        mergeSort(leftIds);
        mergeSort(rightIds);
        merge(ids, leftIds, rightIds);

    }

    private void merge(long[] ids, long[] left, long[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ids[k] = left[i];
                i++;
            } else {
                ids[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            ids[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ids[k] = right[j];
            j++;
            k++;
        }

    }

}
