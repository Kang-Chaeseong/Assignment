function handleFileSelection(){
    var selectedFiles = document.getElementById('fileInput').files;
    var fileContainer = document.getElementById('fileContainer');

    for(var i = 0; i<selectedFiles.length; i++){
        var fileList = document.createElement('div');
        fileList.classList.add('file-box');
        fileList.dataset.index = i+1;

        var fileName = document.createElement('p');
        fileName.classList.add('file-name');
        fileName.textContent = selectedFiles[i].name;

        var deleteButton = document.createElement('span');
        deleteButton.classList.add('delete-button');
        deleteButton.textContent = '삭제';

        deleteButton.addEventListener('click',function (){
            fileList.remove();
        });

        fileList.appendChild(fileName);
        fileList.appendChild(deleteButton);
        fileContainer.appendChild(fileList);
    }
}