/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    
     let result=[];
    for(i=0;i<numRows;i++){
        let item=[];
let preResultElement = result[i-1];
let len = preResultElement && preResultElement.length || 0;
item.push(1);
if(len > 0){
       for(j=1;j<len;j++){
    item.push(preResultElement[j] + preResultElement[j-1])
}
item.push(1);
}
        result.push(item);
    }
    return result;
};